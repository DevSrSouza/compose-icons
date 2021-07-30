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

public val SimpleIcons.Dialogflow: ImageVector
    get() {
        if (_dialogflow != null) {
            return _dialogflow!!
        }
        _dialogflow = Builder(name = "Dialogflow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.996f, 0.0f)
                arcToRelative(1.639f, 1.639f, 0.0f, false, false, -0.82f, 0.22f)
                lineTo(3.344f, 4.74f)
                arcToRelative(1.648f, 1.648f, 0.0f, false, false, -0.535f, 0.498f)
                lineToRelative(9.136f, 5.28f)
                lineToRelative(9.213f, -5.32f)
                arcToRelative(1.652f, 1.652f, 0.0f, false, false, -0.51f, -0.458f)
                lineTo(12.818f, 0.22f)
                arcToRelative(1.639f, 1.639f, 0.0f, false, false, -0.822f, -0.22f)
                close()
                moveTo(21.332f, 5.5f)
                lineToRelative(-9.387f, 5.422f)
                lineToRelative(-9.3f, -5.373f)
                arcToRelative(1.648f, 1.648f, 0.0f, false, false, -0.12f, 0.615f)
                verticalLineToRelative(9.043f)
                arcToRelative(1.643f, 1.643f, 0.0f, false, false, 0.819f, 1.42f)
                lineToRelative(3.918f, 2.266f)
                verticalLineToRelative(4.617f)
                arcToRelative(0.493f, 0.493f, 0.0f, false, false, 0.74f, 0.424f)
                lineToRelative(12.654f, -7.303f)
                arcToRelative(1.639f, 1.639f, 0.0f, false, false, 0.819f, -1.42f)
                lineTo(21.475f, 6.162f)
                arcToRelative(1.652f, 1.652f, 0.0f, false, false, -0.143f, -0.662f)
                close()
            }
        }
        .build()
        return _dialogflow!!
    }

private var _dialogflow: ImageVector? = null
