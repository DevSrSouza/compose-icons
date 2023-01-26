package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.FaceRetouchingNatural: ImageVector
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
                moveTo(20.77f, 8.58f)
                lineToRelative(-0.92f, 2.01f)
                curveToRelative(0.09f, 0.46f, 0.15f, 0.93f, 0.15f, 1.41f)
                curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.0f, -0.14f)
                curveToRelative(2.6f, -0.98f, 4.69f, -2.99f, 5.74f, -5.55f)
                curveTo(11.58f, 8.56f, 14.37f, 10.0f, 17.5f, 10.0f)
                curveToRelative(0.45f, 0.0f, 0.89f, -0.04f, 1.33f, -0.1f)
                lineToRelative(-0.6f, -1.32f)
                lineToRelative(-0.88f, -1.93f)
                lineToRelative(-1.93f, -0.88f)
                lineToRelative(-2.79f, -1.27f)
                lineToRelative(2.79f, -1.27f)
                lineToRelative(0.71f, -0.32f)
                curveTo(14.87f, 2.33f, 13.47f, 2.0f, 12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveToRelative(0.0f, -1.47f, -0.33f, -2.87f, -0.9f, -4.13f)
                lineToRelative(-0.33f, 0.71f)
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
                close()
            }
        }
        .build()
        return _faceRetouchingNatural!!
    }

private var _faceRetouchingNatural: ImageVector? = null
