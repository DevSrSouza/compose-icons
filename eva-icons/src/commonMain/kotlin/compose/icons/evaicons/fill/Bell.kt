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

public val FillGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.52f, 15.21f)
                lineToRelative(-1.8f, -1.81f)
                verticalLineTo(8.94f)
                arcTo(6.86f, 6.86f, 0.0f, false, false, 12.9f, 2.06f)
                arcTo(6.74f, 6.74f, 0.0f, false, false, 5.28f, 8.73f)
                verticalLineTo(13.4f)
                lineToRelative(-1.8f, 1.81f)
                arcTo(1.64f, 1.64f, 0.0f, false, false, 4.64f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(0.34f)
                arcTo(3.84f, 3.84f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(3.84f, 3.84f, 0.0f, false, false, 4.0f, -3.66f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(3.36f)
                arcToRelative(1.64f, 1.64f, 0.0f, false, false, 1.16f, -2.79f)
                close()
                moveTo(14.0f, 18.34f)
                arcTo(1.88f, 1.88f, 0.0f, false, true, 12.0f, 20.0f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -2.0f, -1.66f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
