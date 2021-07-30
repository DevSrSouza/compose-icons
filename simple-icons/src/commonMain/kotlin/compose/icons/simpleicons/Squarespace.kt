package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Squarespace: ImageVector
    get() {
        if (_squarespace != null) {
            return _squarespace!!
        }
        _squarespace = Builder(name = "Squarespace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.655f, 8.719f)
                curveToRelative(-1.802f, -1.801f, -4.726f, -1.801f, -6.564f, 0.0f)
                lineToRelative(-7.351f, 7.35f)
                curveToRelative(-0.45f, 0.45f, -0.45f, 1.2f, 0.0f, 1.65f)
                curveToRelative(0.45f, 0.449f, 1.2f, 0.449f, 1.65f, 0.0f)
                lineToRelative(7.351f, -7.351f)
                curveToRelative(0.899f, -0.899f, 2.362f, -0.899f, 3.264f, 0.0f)
                curveToRelative(0.9f, 0.9f, 0.9f, 2.364f, 0.0f, 3.264f)
                lineToRelative(-7.239f, 7.239f)
                curveToRelative(0.9f, 0.899f, 2.362f, 0.899f, 3.263f, 0.0f)
                lineToRelative(5.589f, -5.589f)
                curveToRelative(1.836f, -1.838f, 1.836f, -4.763f, 0.037f, -6.563f)
                close()
                moveTo(20.18f, 11.156f)
                curveToRelative(-0.451f, -0.45f, -1.201f, -0.45f, -1.65f, 0.0f)
                lineToRelative(-7.354f, 7.389f)
                curveToRelative(-0.9f, 0.899f, -2.361f, 0.899f, -3.262f, 0.0f)
                curveToRelative(-0.45f, -0.45f, -1.2f, -0.45f, -1.65f, 0.0f)
                reflectiveCurveToRelative(-0.45f, 1.2f, 0.0f, 1.649f)
                curveToRelative(1.801f, 1.801f, 4.726f, 1.801f, 6.564f, 0.0f)
                lineToRelative(7.351f, -7.35f)
                curveToRelative(0.449f, -0.487f, 0.449f, -1.239f, 0.001f, -1.688f)
                close()
                moveTo(17.741f, 3.806f)
                curveToRelative(-1.801f, -1.801f, -4.726f, -1.801f, -6.564f, 0.0f)
                lineToRelative(-7.351f, 7.351f)
                curveToRelative(-0.45f, 0.449f, -0.45f, 1.199f, 0.0f, 1.649f)
                reflectiveCurveToRelative(1.2f, 0.45f, 1.65f, 0.0f)
                lineToRelative(7.395f, -7.351f)
                curveToRelative(0.9f, -0.899f, 2.371f, -0.899f, 3.27f, 0.0f)
                curveToRelative(0.451f, 0.45f, 1.201f, 0.45f, 1.65f, 0.0f)
                curveToRelative(0.421f, -0.487f, 0.421f, -1.199f, -0.029f, -1.649f)
                horizontalLineToRelative(-0.021f)
                close()
                moveTo(15.266f, 6.243f)
                curveToRelative(-0.45f, -0.45f, -1.2f, -0.45f, -1.65f, 0.0f)
                lineToRelative(-7.351f, 7.389f)
                curveToRelative(-0.899f, 0.9f, -2.363f, 0.9f, -3.265f, 0.0f)
                curveToRelative(-0.9f, -0.899f, -0.9f, -2.363f, 0.0f, -3.264f)
                lineToRelative(7.239f, -7.239f)
                curveToRelative(-0.9f, -0.9f, -2.362f, -0.9f, -3.263f, 0.0f)
                lineTo(1.35f, 8.719f)
                curveToRelative(-1.8f, 1.8f, -1.8f, 4.725f, 0.0f, 6.563f)
                curveToRelative(1.801f, 1.801f, 4.725f, 1.801f, 6.564f, 0.0f)
                lineToRelative(7.35f, -7.351f)
                curveToRelative(0.451f, -0.488f, 0.451f, -1.238f, 0.0f, -1.688f)
                horizontalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _squarespace!!
    }

private var _squarespace: ImageVector? = null
