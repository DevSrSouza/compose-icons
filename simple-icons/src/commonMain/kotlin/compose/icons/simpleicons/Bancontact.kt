package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Bancontact: ImageVector
    get() {
        if (_bancontact != null) {
            return _bancontact!!
        }
        _bancontact = Builder(name = "Bancontact", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.385f, 9.768f)
                horizontalLineToRelative(-7.074f)
                lineToRelative(-4.293f, 5.022f)
                lineTo(1.557f, 14.79f)
                lineTo(3.84f, 12.1f)
                lineTo(1.122f, 12.1f)
                curveTo(0.505f, 12.1f, 0.0f, 12.616f, 0.0f, 13.25f)
                verticalLineToRelative(2.428f)
                curveToRelative(0.0f, 0.633f, 0.505f, 1.15f, 1.122f, 1.15f)
                horizontalLineToRelative(12.933f)
                curveToRelative(0.617f, 0.0f, 1.46f, -0.384f, 1.874f, -0.854f)
                lineToRelative(1.956f, -2.225f)
                lineToRelative(3.469f, -3.946f)
                lineToRelative(0.031f, -0.035f)
                close()
                moveTo(20.262f, 11.047f)
                lineToRelative(-0.751f, 0.855f)
                lineToRelative(0.75f, -0.855f)
                close()
                moveTo(22.878f, 7.172f)
                lineTo(9.982f, 7.172f)
                curveToRelative(-0.617f, 0.0f, -1.462f, 0.384f, -1.876f, 0.853f)
                lineToRelative(-5.49f, 6.208f)
                horizontalLineToRelative(7.047f)
                lineToRelative(4.368f, -5.02f)
                horizontalLineToRelative(8.424f)
                lineToRelative(-2.263f, 2.689f)
                horizontalLineToRelative(2.686f)
                curveToRelative(0.617f, 0.0f, 1.122f, -0.518f, 1.122f, -1.151f)
                lineTo(24.0f, 8.323f)
                curveToRelative(0.0f, -0.633f, -0.505f, -1.15f, -1.122f, -1.15f)
                close()
                moveTo(21.008f, 10.196f)
                lineToRelative(-0.374f, 0.427f)
                lineToRelative(-0.1f, 0.114f)
                lineToRelative(0.474f, -0.54f)
                close()
            }
        }
        .build()
        return _bancontact!!
    }

private var _bancontact: ImageVector? = null
