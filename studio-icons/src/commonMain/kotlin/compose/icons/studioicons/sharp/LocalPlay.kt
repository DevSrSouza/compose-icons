package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.LocalPlay: ImageVector
    get() {
        if (_localPlay != null) {
            return _localPlay!!
        }
        _localPlay = Builder(name = "LocalPlay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                lineTo(22.0f, 4.0f)
                lineTo(2.01f, 4.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(1.1f, 0.0f, 1.99f, 0.9f, 1.99f, 2.0f)
                reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                close()
                moveTo(15.58f, 16.8f)
                lineTo(12.0f, 14.5f)
                lineToRelative(-3.58f, 2.3f)
                lineToRelative(1.08f, -4.12f)
                lineToRelative(-3.29f, -2.69f)
                lineToRelative(4.24f, -0.25f)
                lineTo(12.0f, 5.8f)
                lineToRelative(1.54f, 3.95f)
                lineToRelative(4.24f, 0.25f)
                lineToRelative(-3.29f, 2.69f)
                lineToRelative(1.09f, 4.11f)
                close()
            }
        }
        .build()
        return _localPlay!!
    }

private var _localPlay: ImageVector? = null
