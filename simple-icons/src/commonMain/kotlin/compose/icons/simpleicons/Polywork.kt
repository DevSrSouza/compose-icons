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

public val SimpleIcons.Polywork: ImageVector
    get() {
        if (_polywork != null) {
            return _polywork!!
        }
        _polywork = Builder(name = "Polywork", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.125f, 0.0f)
                lineTo(4.875f, 0.0f)
                arcTo(4.865f, 4.865f, 0.0f, false, false, 0.0f, 4.875f)
                verticalLineToRelative(14.25f)
                curveTo(0.0f, 21.825f, 2.175f, 24.0f, 4.875f, 24.0f)
                horizontalLineToRelative(6.6f)
                curveToRelative(2.7f, 0.0f, 4.875f, -2.175f, 4.875f, -4.875f)
                lineTo(16.35f, 16.65f)
                horizontalLineToRelative(2.775f)
                curveToRelative(2.7f, 0.0f, 4.875f, -2.175f, 4.875f, -4.875f)
                verticalLineToRelative(-6.9f)
                curveTo(24.0f, 2.175f, 21.825f, 0.0f, 19.125f, 0.0f)
                close()
                moveTo(16.5f, 1.275f)
                horizontalLineToRelative(2.625f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 3.6f, 3.6f)
                verticalLineToRelative(2.7f)
                lineTo(16.5f, 7.575f)
                verticalLineToRelative(-6.3f)
                close()
                moveTo(15.075f, 9.0f)
                verticalLineToRelative(6.45f)
                lineTo(8.85f, 15.45f)
                lineTo(8.85f, 9.0f)
                horizontalLineToRelative(6.225f)
                close()
                moveTo(8.85f, 1.2f)
                horizontalLineToRelative(6.225f)
                verticalLineToRelative(6.375f)
                lineTo(8.85f, 7.575f)
                lineTo(8.85f, 1.2f)
                close()
                moveTo(1.275f, 4.8f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 3.6f, -3.6f)
                lineTo(7.5f, 1.2f)
                verticalLineToRelative(6.375f)
                lineTo(1.275f, 7.575f)
                lineTo(1.275f, 4.8f)
                close()
                moveTo(7.5f, 9.0f)
                verticalLineToRelative(6.45f)
                lineTo(1.2f, 15.45f)
                lineTo(1.2f, 9.0f)
                horizontalLineToRelative(6.3f)
                close()
                moveTo(7.5f, 22.725f)
                lineTo(4.8f, 22.725f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -3.6f, -3.6f)
                lineTo(1.2f, 16.8f)
                horizontalLineToRelative(6.3f)
                verticalLineToRelative(5.925f)
                close()
                moveTo(15.075f, 19.2f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -3.6f, 3.6f)
                lineTo(8.85f, 22.8f)
                verticalLineToRelative(-5.925f)
                horizontalLineToRelative(6.225f)
                lineTo(15.075f, 19.2f)
                close()
                moveTo(22.725f, 11.85f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -3.6f, 3.6f)
                lineTo(16.5f, 15.45f)
                lineTo(16.5f, 9.0f)
                horizontalLineToRelative(6.225f)
                verticalLineToRelative(2.85f)
                close()
            }
        }
        .build()
        return _polywork!!
    }

private var _polywork: ImageVector? = null
