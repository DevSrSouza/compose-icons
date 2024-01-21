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

public val SimpleIcons.Wix: ImageVector
    get() {
        if (_wix != null) {
            return _wix!!
        }
        _wix = Builder(name = "Wix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 7.354f)
                lineToRelative(2.113f, 9.292f)
                horizontalLineToRelative(0.801f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, false, 1.506f, -1.218f)
                lineToRelative(1.351f, -6.34f)
                arcToRelative(0.171f, 0.171f, 0.0f, false, true, 0.167f, -0.137f)
                curveToRelative(0.08f, 0.0f, 0.15f, 0.058f, 0.167f, 0.137f)
                lineToRelative(1.352f, 6.34f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, false, 1.506f, 1.218f)
                horizontalLineToRelative(0.805f)
                lineToRelative(2.113f, -9.292f)
                horizontalLineToRelative(-0.565f)
                curveToRelative(-0.62f, 0.0f, -1.159f, 0.43f, -1.296f, 1.035f)
                lineToRelative(-1.26f, 5.545f)
                lineToRelative(-1.106f, -5.176f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, -2.19f, -1.324f)
                curveToRelative(-0.639f, 0.176f, -1.113f, 0.716f, -1.251f, 1.365f)
                lineToRelative(-1.094f, 5.127f)
                lineToRelative(-1.26f, -5.537f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 0.563f, 7.354f)
                lineTo(0.0f, 7.354f)
                close()
                moveTo(13.992f, 7.354f)
                arcToRelative(0.951f, 0.951f, 0.0f, false, false, -0.951f, 0.95f)
                verticalLineToRelative(8.342f)
                horizontalLineToRelative(0.635f)
                arcToRelative(0.952f, 0.952f, 0.0f, false, false, 0.951f, -0.95f)
                lineTo(14.627f, 7.353f)
                horizontalLineToRelative(-0.635f)
                close()
                moveTo(15.77f, 7.354f)
                lineTo(18.928f, 12.014f)
                lineTo(15.788f, 16.646f)
                horizontalLineToRelative(1.325f)
                curveToRelative(0.368f, 0.0f, 0.712f, -0.181f, 0.918f, -0.486f)
                lineToRelative(1.756f, -2.59f)
                arcToRelative(0.12f, 0.12f, 0.0f, false, true, 0.197f, 0.0f)
                lineToRelative(1.754f, 2.59f)
                curveToRelative(0.206f, 0.305f, 0.55f, 0.486f, 0.918f, 0.486f)
                horizontalLineToRelative(1.326f)
                lineToRelative(-3.14f, -4.632f)
                lineTo(24.0f, 7.354f)
                horizontalLineToRelative(-1.326f)
                curveToRelative(-0.368f, 0.0f, -0.712f, 0.181f, -0.918f, 0.486f)
                lineToRelative(-1.772f, 2.617f)
                arcToRelative(0.12f, 0.12f, 0.0f, false, true, -0.197f, 0.0f)
                lineTo(18.014f, 7.84f)
                arcToRelative(1.108f, 1.108f, 0.0f, false, false, -0.918f, -0.486f)
                lineTo(15.77f, 7.354f)
                close()
            }
        }
        .build()
        return _wix!!
    }

private var _wix: ImageVector? = null
