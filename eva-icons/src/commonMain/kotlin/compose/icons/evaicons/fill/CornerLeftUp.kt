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

public val FillGroup.CornerLeftUp: ImageVector
    get() {
        if (_cornerLeftUp != null) {
            return _cornerLeftUp!!
        }
        _cornerLeftUp = Builder(name = "CornerLeftUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 17.0f)
                horizontalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(7.08f)
                lineToRelative(3.38f, 2.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, -0.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.16f, -1.4f)
                lineToRelative(-5.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.24f, 0.0f)
                lineToRelative(-5.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.62f, 9.78f)
                lineTo(10.0f, 7.08f)
                verticalLineTo(16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _cornerLeftUp!!
    }

private var _cornerLeftUp: ImageVector? = null
