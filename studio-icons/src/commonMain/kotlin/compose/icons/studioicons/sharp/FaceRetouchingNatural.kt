package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FaceRetouchingNatural: ImageVector
    get() {
        if (_faceRetouchingNatural != null) {
            return _faceRetouchingNatural!!
        }
        _faceRetouchingNatural = Builder(name = "FaceRetouchingNatural", defaultWidth = 24.0.dp,
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
                moveTo(19.85f, 10.59f)
                curveTo(20.79f, 15.4f, 17.01f, 20.0f, 12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -0.39f, 3.87f, -1.12f, 5.74f, -5.69f)
                curveToRelative(3.42f, 4.19f, 8.07f, 3.73f, 9.09f, 3.59f)
                lineToRelative(-1.48f, -3.25f)
                lineTo(12.63f, 4.5f)
                lineToRelative(3.5f, -1.59f)
                curveTo(9.51f, -0.14f, 2.0f, 4.77f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                curveToRelative(7.21f, 0.0f, 12.12f, -7.45f, 9.1f, -14.13f)
                lineTo(19.85f, 10.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                moveToRelative(-1.25f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6f, 5.6f)
                lineTo(19.5f, 8.0f)
                lineToRelative(-1.1f, -2.4f)
                lineTo(16.0f, 4.5f)
                lineToRelative(2.4f, -1.1f)
                lineTo(19.5f, 1.0f)
                lineToRelative(1.1f, 2.4f)
                lineTo(23.0f, 4.5f)
                lineTo(20.6f, 5.6f)
                close()
            }
        }
        .build()
        return _faceRetouchingNatural!!
    }

private var _faceRetouchingNatural: ImageVector? = null
