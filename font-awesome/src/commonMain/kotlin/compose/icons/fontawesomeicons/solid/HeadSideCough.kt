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

public val SolidGroup.HeadSideCough: ImageVector
    get() {
        if (_headSideCough != null) {
            return _headSideCough!!
        }
        _headSideCough = Builder(name = "HeadSideCough", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 224.2f)
                curveTo(0.0f, 100.6f, 100.2f, 0.0f, 224.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(95.2f, 0.0f, 181.2f, 69.3f, 197.3f, 160.2f)
                curveToRelative(2.3f, 13.0f, 6.8f, 25.7f, 15.1f, 36.0f)
                lineToRelative(42.0f, 52.6f)
                curveToRelative(6.2f, 7.8f, 9.6f, 17.4f, 9.6f, 27.4f)
                curveToRelative(0.0f, 24.2f, -19.6f, 43.8f, -43.8f, 43.8f)
                lineTo(448.0f, 320.0f)
                verticalLineToRelative(0.0f)
                verticalLineToRelative(32.0f)
                lineTo(339.2f, 365.6f)
                curveToRelative(-11.0f, 1.4f, -19.2f, 10.7f, -19.2f, 21.8f)
                curveToRelative(0.0f, 11.6f, 9.0f, 21.2f, 20.6f, 21.9f)
                lineTo(448.0f, 416.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(320.0f, 480.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(256.0f, 512.0f)
                verticalLineToRelative(0.0f)
                lineTo(96.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(64.0f, 407.3f)
                curveToRelative(0.0f, -16.7f, -6.9f, -32.5f, -17.1f, -45.8f)
                curveTo(16.6f, 322.4f, 0.0f, 274.1f, 0.0f, 224.2f)
                close()
                moveTo(352.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(464.0f, 384.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
                moveTo(616.0f, 360.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(592.0f, 480.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
                moveTo(552.0f, 312.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(592.0f, 288.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
                moveTo(552.0f, 408.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _headSideCough!!
    }

private var _headSideCough: ImageVector? = null
