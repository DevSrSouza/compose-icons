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

public val SimpleIcons.Stadia: ImageVector
    get() {
        if (_stadia != null) {
            return _stadia!!
        }
        _stadia = Builder(name = "Stadia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5253f, 10.0302f)
                arcToRelative(18.279f, 18.279f, 0.0f, false, true, 15.7805f, 0.263f)
                curveToRelative(0.263f, 0.1973f, 0.6575f, 0.0f, 0.7233f, -0.263f)
                lineToRelative(0.9205f, -2.8273f)
                curveToRelative(0.1315f, -0.263f, 0.0f, -0.6576f, -0.3288f, -0.789f)
                arcTo(22.3557f, 22.3557f, 0.0f, false, false, 0.2788f, 8.6493f)
                arcToRelative(0.6575f, 0.6575f, 0.0f, false, false, -0.1972f, 0.8548f)
                lineToRelative(2.1698f, 4.7999f)
                curveToRelative(0.1315f, 0.3287f, 0.526f, 0.526f, 0.8548f, 0.3945f)
                curveToRelative(2.4328f, -0.9205f, 6.1807f, -1.841f, 9.9943f, -1.315f)
                curveToRelative(-2.63f, 0.4602f, -4.6684f, 1.3807f, -6.3122f, 2.367f)
                arcToRelative(0.6575f, 0.6575f, 0.0f, false, false, -0.1972f, 0.8548f)
                lineTo(7.906f, 19.63f)
                curveToRelative(0.1315f, 0.263f, 0.4603f, 0.3288f, 0.6575f, 0.1315f)
                curveToRelative(0.526f, -0.526f, 1.052f, -0.9205f, 1.5123f, -1.1835f)
                curveToRelative(2.104f, -1.1836f, 4.9972f, -2.1041f, 8.8765f, -1.9068f)
                arcToRelative(0.6575f, 0.6575f, 0.0f, false, false, 0.6576f, -0.4603f)
                lineToRelative(0.9862f, -2.9589f)
                curveToRelative(0.1316f, -0.263f, 0.0f, -0.6575f, -0.263f, -0.789f)
                arcToRelative(20.0544f, 20.0544f, 0.0f, false, false, -13.8737f, -2.4328f)
                close()
            }
        }
        .build()
        return _stadia!!
    }

private var _stadia: ImageVector? = null
