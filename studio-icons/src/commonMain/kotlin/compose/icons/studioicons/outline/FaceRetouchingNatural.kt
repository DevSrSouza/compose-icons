package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FaceRetouchingNatural: ImageVector
    get() {
        if (_faceRetouchingNatural != null) {
            return _faceRetouchingNatural!!
        }
        _faceRetouchingNatural = Builder(name = "FaceRetouchingNatural", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.89f, 10.75f)
                curveTo(19.96f, 11.16f, 20.0f, 11.57f, 20.0f, 12.0f)
                curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.0f, -0.14f)
                curveToRelative(2.6f, -0.98f, 4.69f, -2.99f, 5.74f, -5.55f)
                curveToRelative(3.38f, 4.14f, 7.97f, 3.73f, 8.99f, 3.61f)
                lineToRelative(-0.89f, -1.93f)
                curveToRelative(-0.13f, 0.01f, -4.62f, 0.38f, -7.18f, -3.86f)
                curveToRelative(1.01f, -0.16f, 1.71f, -0.15f, 2.59f, -0.01f)
                curveToRelative(2.52f, -1.15f, 1.93f, -0.89f, 2.76f, -1.26f)
                curveTo(14.78f, 2.3f, 13.43f, 2.0f, 12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveToRelative(0.0f, -1.43f, -0.3f, -2.78f, -0.84f, -4.01f)
                lineTo(19.89f, 10.75f)
                close()
                moveTo(8.08f, 5.03f)
                curveTo(7.45f, 6.92f, 6.13f, 8.5f, 4.42f, 9.47f)
                curveTo(5.05f, 7.58f, 6.37f, 6.0f, 8.08f, 5.03f)
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
                moveTo(9.0f, 13.0f)
                moveToRelative(-1.25f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 4.5f)
                lineToRelative(-2.4f, -1.1f)
                lineToRelative(-1.1f, -2.4f)
                lineToRelative(-1.1f, 2.4f)
                lineToRelative(-2.4f, 1.1f)
                lineToRelative(2.4f, 1.1f)
                lineToRelative(1.1f, 2.4f)
                lineToRelative(1.1f, -2.4f)
                close()
            }
        }
        .build()
        return _faceRetouchingNatural!!
    }

private var _faceRetouchingNatural: ImageVector? = null
