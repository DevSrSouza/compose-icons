package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FaceGrinTongue: ImageVector
    get() {
        if (_faceGrinTongue != null) {
            return _faceGrinTongue!!
        }
        _faceGrinTongue = Builder(name = "FaceGrinTongue", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                curveTo(0.0f, 368.9f, 73.1f, 464.7f, 174.5f, 498.8f)
                curveTo(165.3f, 484.0f, 160.0f, 466.6f, 160.0f, 448.0f)
                lineTo(160.0f, 400.7f)
                curveToRelative(-24.0f, -17.5f, -43.1f, -41.4f, -54.8f, -69.2f)
                curveToRelative(-5.0f, -11.8f, 7.0f, -22.5f, 19.3f, -18.7f)
                curveToRelative(39.7f, 12.2f, 84.5f, 19.0f, 131.8f, 19.0f)
                reflectiveCurveToRelative(92.1f, -6.8f, 131.8f, -19.0f)
                curveToRelative(12.3f, -3.8f, 24.3f, 6.9f, 19.3f, 18.7f)
                curveToRelative(-11.8f, 28.0f, -31.1f, 52.0f, -55.4f, 69.6f)
                lineTo(352.0f, 448.0f)
                curveToRelative(0.0f, 18.6f, -5.3f, 36.0f, -14.5f, 50.8f)
                curveTo(438.9f, 464.7f, 512.0f, 368.9f, 512.0f, 256.0f)
                curveTo(512.0f, 114.6f, 397.4f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(0.0f, 114.6f, 0.0f, 256.0f)
                close()
                moveTo(176.4f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(304.4f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(320.0f, 448.0f)
                lineTo(320.0f, 402.6f)
                curveToRelative(0.0f, -14.7f, -11.9f, -26.6f, -26.6f, -26.6f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-11.3f, 0.0f, -21.1f, 7.9f, -23.6f, 18.9f)
                curveToRelative(-2.8f, 12.6f, -20.8f, 12.6f, -23.6f, 0.0f)
                curveToRelative(-2.5f, -11.1f, -12.3f, -18.9f, -23.6f, -18.9f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-14.7f, 0.0f, -26.6f, 11.9f, -26.6f, 26.6f)
                lineTo(192.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _faceGrinTongue!!
    }

private var _faceGrinTongue: ImageVector? = null
