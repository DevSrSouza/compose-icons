package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.EyeSlashSolid: ImageVector
    get() {
        if (_eyeSlashSolid != null) {
            return _eyeSlashSolid!!
        }
        _eyeSlashSolid = Builder(name = "EyeSlashSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.719f, 2.281f)
                lineTo(2.281f, 3.719f)
                lineTo(8.469f, 9.875f)
                lineTo(21.438f, 22.844f)
                lineTo(28.281f, 29.719f)
                lineTo(29.719f, 28.281f)
                lineTo(23.375f, 21.938f)
                curveTo(27.473f, 19.852f, 30.527f, 16.91f, 30.719f, 16.719f)
                lineTo(31.375f, 16.063f)
                lineTo(30.75f, 15.344f)
                curveTo(30.492f, 15.043f, 24.395f, 8.0f, 16.0f, 8.0f)
                curveTo(14.008f, 8.0f, 12.152f, 8.418f, 10.469f, 9.031f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(18.164f, 10.0f, 20.16f, 10.555f, 21.938f, 11.344f)
                curveTo(22.613f, 12.445f, 23.0f, 13.699f, 23.0f, 15.0f)
                curveTo(23.0f, 16.816f, 22.301f, 18.469f, 21.156f, 19.719f)
                lineTo(18.313f, 16.875f)
                curveTo(18.727f, 16.363f, 19.0f, 15.711f, 19.0f, 15.0f)
                curveTo(19.0f, 13.348f, 17.652f, 12.0f, 16.0f, 12.0f)
                curveTo(15.289f, 12.0f, 14.637f, 12.273f, 14.125f, 12.688f)
                lineTo(12.063f, 10.625f)
                curveTo(13.301f, 10.254f, 14.609f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(6.625f, 10.875f)
                curveTo(3.387f, 12.863f, 1.395f, 15.172f, 1.25f, 15.344f)
                lineTo(0.625f, 16.063f)
                lineTo(1.281f, 16.719f)
                curveTo(1.566f, 17.004f, 8.098f, 23.383f, 15.063f, 23.938f)
                lineTo(15.125f, 23.938f)
                curveTo(15.414f, 23.961f, 15.711f, 24.0f, 16.0f, 24.0f)
                curveTo(16.289f, 24.0f, 16.586f, 23.961f, 16.875f, 23.938f)
                lineTo(16.938f, 23.938f)
                curveTo(17.734f, 23.875f, 18.535f, 23.73f, 19.313f, 23.531f)
                lineTo(17.594f, 21.813f)
                curveTo(17.344f, 21.871f, 17.074f, 21.91f, 16.813f, 21.938f)
                lineTo(16.688f, 21.969f)
                curveTo(16.219f, 22.008f, 15.777f, 22.008f, 15.313f, 21.969f)
                lineTo(15.219f, 21.938f)
                curveTo(11.68f, 21.539f, 9.0f, 18.566f, 9.0f, 15.0f)
                curveTo(9.0f, 14.465f, 9.066f, 13.949f, 9.188f, 13.438f)
                close()
                moveTo(7.281f, 12.844f)
                curveTo(7.105f, 13.547f, 7.0f, 14.262f, 7.0f, 15.0f)
                curveTo(7.0f, 16.613f, 7.438f, 18.121f, 8.188f, 19.438f)
                curveTo(6.066f, 18.176f, 4.32f, 16.75f, 3.406f, 15.938f)
                curveTo(4.152f, 15.195f, 5.508f, 13.988f, 7.281f, 12.844f)
                close()
                moveTo(24.719f, 12.844f)
                curveTo(26.492f, 13.988f, 27.816f, 15.227f, 28.563f, 15.969f)
                curveTo(27.648f, 16.781f, 25.934f, 18.176f, 23.813f, 19.438f)
                curveTo(24.563f, 18.121f, 25.0f, 16.613f, 25.0f, 15.0f)
                curveTo(25.0f, 14.266f, 24.891f, 13.547f, 24.719f, 12.844f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(16.551f, 14.0f, 17.0f, 14.449f, 17.0f, 15.0f)
                curveTo(17.0f, 15.164f, 16.945f, 15.301f, 16.875f, 15.438f)
                lineTo(15.563f, 14.125f)
                curveTo(15.699f, 14.055f, 15.836f, 14.0f, 16.0f, 14.0f)
                close()
            }
        }
        .build()
        return _eyeSlashSolid!!
    }

private var _eyeSlashSolid: ImageVector? = null
