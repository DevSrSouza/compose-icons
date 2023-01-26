package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.FaceRetouchingOff: ImageVector
    get() {
        if (_faceRetouchingOff != null) {
            return _faceRetouchingOff!!
        }
        _faceRetouchingOff = Builder(name = "FaceRetouchingOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                moveToRelative(-1.25f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 10.0f)
                curveToRelative(0.75f, 0.0f, 1.47f, -0.09f, 2.17f, -0.24f)
                curveTo(19.88f, 10.47f, 20.0f, 11.22f, 20.0f, 12.0f)
                curveToRelative(0.0f, 1.22f, -0.28f, 2.37f, -0.77f, 3.4f)
                lineToRelative(1.49f, 1.49f)
                curveTo(21.53f, 15.44f, 22.0f, 13.78f, 22.0f, 12.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                curveToRelative(-1.78f, 0.0f, -3.44f, 0.47f, -4.89f, 1.28f)
                lineToRelative(5.33f, 5.33f)
                curveTo(13.93f, 9.49f, 15.65f, 10.0f, 17.5f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6f, 4.43f)
                lineToRelative(1.48f, 1.48f)
                curveTo(2.51f, 7.95f, 1.7f, 10.6f, 2.1f, 13.46f)
                curveToRelative(0.62f, 4.33f, 4.11f, 7.82f, 8.44f, 8.44f)
                curveToRelative(2.85f, 0.41f, 5.51f, -0.41f, 7.55f, -1.98f)
                lineToRelative(1.48f, 1.48f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(4.01f, 3.01f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(2.21f, 3.41f, 2.21f, 4.04f, 2.6f, 4.43f)
                close()
                moveTo(16.66f, 18.49f)
                curveTo(15.35f, 19.44f, 13.74f, 20.0f, 12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.0f, -0.14f)
                curveToRelative(1.39f, -0.52f, 2.63f, -1.35f, 3.64f, -2.39f)
                lineTo(16.66f, 18.49f)
                close()
            }
        }
        .build()
        return _faceRetouchingOff!!
    }

private var _faceRetouchingOff: ImageVector? = null
