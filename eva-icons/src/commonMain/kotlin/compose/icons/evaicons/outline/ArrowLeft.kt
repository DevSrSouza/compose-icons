package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(13.54f, 18.0f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, true, -1.3f, -0.46f)
                lineToRelative(-5.1f, -4.21f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, 0.0f, -2.66f)
                lineToRelative(5.1f, -4.21f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 2.21f, -0.26f)
                arcTo(1.76f, 1.76f, 0.0f, false, true, 15.5f, 7.79f)
                verticalLineToRelative(8.42f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, -1.05f, 1.59f)
                arcTo(2.23f, 2.23f, 0.0f, false, true, 13.54f, 18.0f)
                close()
                moveTo(8.68f, 12.0f)
                lineToRelative(4.82f, 4.0f)
                verticalLineTo(8.09f)
                close()
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
