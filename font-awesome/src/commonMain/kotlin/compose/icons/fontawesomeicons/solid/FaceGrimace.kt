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

public val SolidGroup.FaceGrimace: ImageVector
    get() {
        if (_faceGrimace != null) {
            return _faceGrimace!!
        }
        _faceGrimace = Builder(name = "FaceGrimace", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(352.0f, 400.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(344.0f, 360.0f)
                lineToRelative(55.3f, 0.0f)
                curveToRelative(-3.8f, 22.7f, -23.6f, 40.0f, -47.3f, 40.0f)
                close()
                moveTo(399.3f, 344.0f)
                lineTo(344.0f, 344.0f)
                lineTo(344.0f, 304.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(23.8f, 0.0f, 43.5f, 17.3f, 47.3f, 40.0f)
                close()
                moveTo(328.0f, 344.0f)
                lineTo(264.0f, 344.0f)
                lineTo(264.0f, 304.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(328.0f, 400.0f)
                lineTo(264.0f, 400.0f)
                lineTo(264.0f, 360.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(248.0f, 304.0f)
                verticalLineToRelative(40.0f)
                lineToRelative(-64.0f, 0.0f)
                lineTo(184.0f, 304.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(248.0f, 360.0f)
                verticalLineToRelative(40.0f)
                lineTo(184.0f, 400.0f)
                lineTo(184.0f, 360.0f)
                lineToRelative(64.0f, 0.0f)
                close()
                moveTo(168.0f, 344.0f)
                lineTo(112.7f, 344.0f)
                curveToRelative(3.8f, -22.7f, 23.6f, -40.0f, 47.3f, -40.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(168.0f, 400.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-23.8f, 0.0f, -43.5f, -17.3f, -47.3f, -40.0f)
                lineTo(168.0f, 360.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(144.4f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(336.4f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _faceGrimace!!
    }

private var _faceGrimace: ImageVector? = null
