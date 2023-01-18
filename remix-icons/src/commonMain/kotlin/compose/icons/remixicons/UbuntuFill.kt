package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.UbuntuFill: ImageVector
    get() {
        if (_ubuntuFill != null) {
            return _ubuntuFill!!
        }
        _ubuntuFill = Builder(name = "UbuntuFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 5.522f, -4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.522f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                close()
                moveTo(5.2f, 10.664f)
                arcToRelative(1.335f, 1.335f, 0.0f, true, false, 0.0f, 2.67f)
                arcToRelative(1.335f, 1.335f, 0.0f, false, false, 0.0f, -2.67f)
                close()
                moveTo(14.733f, 16.733f)
                arcToRelative(1.334f, 1.334f, 0.0f, true, false, 1.334f, 2.31f)
                arcToRelative(1.334f, 1.334f, 0.0f, false, false, -1.334f, -2.31f)
                close()
                moveTo(8.1f, 12.0f)
                curveToRelative(0.0f, -1.32f, 0.656f, -2.485f, 1.659f, -3.19f)
                lineToRelative(-0.976f, -1.636f)
                arcToRelative(5.813f, 5.813f, 0.0f, false, false, -2.399f, 3.371f)
                arcToRelative(1.875f, 1.875f, 0.0f, false, true, 0.0f, 2.91f)
                arcToRelative(5.813f, 5.813f, 0.0f, false, false, 2.398f, 3.371f)
                lineToRelative(0.977f, -1.636f)
                arcTo(3.892f, 3.892f, 0.0f, false, true, 8.1f, 12.0f)
                close()
                moveTo(12.0f, 8.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.884f, 3.554f)
                lineToRelative(1.903f, -0.028f)
                arcToRelative(5.781f, 5.781f, 0.0f, false, false, -1.723f, -3.762f)
                arcTo(1.872f, 1.872f, 0.0f, false, true, 13.55f, 6.41f)
                arcToRelative(5.829f, 5.829f, 0.0f, false, false, -4.12f, 0.39f)
                lineToRelative(0.927f, 1.663f)
                arcTo(3.885f, 3.885f, 0.0f, false, true, 12.0f, 8.1f)
                close()
                moveTo(12.0f, 15.9f)
                curveToRelative(-0.587f, 0.0f, -1.143f, -0.13f, -1.643f, -0.363f)
                lineToRelative(-0.927f, 1.662f)
                arcToRelative(5.774f, 5.774f, 0.0f, false, false, 4.12f, 0.39f)
                arcToRelative(1.872f, 1.872f, 0.0f, false, true, 2.514f, -1.454f)
                arcToRelative(5.782f, 5.782f, 0.0f, false, false, 1.723f, -3.762f)
                lineToRelative(-1.903f, -0.027f)
                arcTo(3.898f, 3.898f, 0.0f, false, true, 12.0f, 15.9f)
                close()
                moveTo(14.732f, 7.267f)
                arcToRelative(1.335f, 1.335f, 0.0f, true, false, 1.335f, -2.312f)
                arcToRelative(1.335f, 1.335f, 0.0f, false, false, -1.335f, 2.312f)
                close()
            }
        }
        .build()
        return _ubuntuFill!!
    }

private var _ubuntuFill: ImageVector? = null
