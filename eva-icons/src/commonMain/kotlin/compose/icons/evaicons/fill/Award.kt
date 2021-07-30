package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.Award: ImageVector
    get() {
        if (_award != null) {
            return _award!!
        }
        _award = Builder(name = "Award", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 20.75f)
                lineToRelative(-2.31f, -9.0f)
                arcTo(5.94f, 5.94f, 0.0f, false, false, 18.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 8.0f)
                arcToRelative(5.94f, 5.94f, 0.0f, false, false, 1.34f, 3.77f)
                lineTo(5.0f, 20.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.48f, 1.11f)
                lineToRelative(5.33f, -3.13f)
                lineToRelative(5.68f, 3.14f)
                arcTo(0.91f, 0.91f, 0.0f, false, false, 18.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.25f)
                close()
                moveTo(12.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _award!!
    }

private var _award: ImageVector? = null
