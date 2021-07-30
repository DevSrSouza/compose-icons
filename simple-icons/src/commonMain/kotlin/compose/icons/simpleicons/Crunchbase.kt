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

public val SimpleIcons.Crunchbase: ImageVector
    get() {
        if (_crunchbase != null) {
            return _crunchbase!!
        }
        _crunchbase = Builder(name = "Crunchbase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6f, 0.0f)
                lineTo(2.4f, 0.0f)
                arcTo(2.41f, 2.41f, 0.0f, false, false, 0.0f, 2.4f)
                verticalLineToRelative(19.2f)
                arcTo(2.41f, 2.41f, 0.0f, false, false, 2.4f, 24.0f)
                horizontalLineToRelative(19.2f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, false, 2.4f, -2.4f)
                lineTo(24.0f, 2.4f)
                arcTo(2.41f, 2.41f, 0.0f, false, false, 21.6f, 0.0f)
                close()
                moveTo(7.045f, 14.465f)
                arcTo(2.11f, 2.11f, 0.0f, false, false, 9.84f, 13.42f)
                horizontalLineToRelative(1.66f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, -1.75f)
                lineTo(9.84f, 11.67f)
                arcToRelative(2.11f, 2.11f, 0.0f, true, false, -2.795f, 2.795f)
                close()
                moveTo(18.39f, 15.31f)
                arcToRelative(3.55f, 3.55f, 0.0f, false, true, -1.06f, 0.63f)
                arcToRelative(3.68f, 3.68f, 0.0f, false, true, -3.39f, -0.38f)
                verticalLineToRelative(0.38f)
                horizontalLineToRelative(-1.51f)
                lineTo(12.43f, 5.37f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.11f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, true, 1.8f, -0.63f)
                lineTo(16.0f, 8.85f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, true, 2.39f, 6.46f)
                close()
                moveTo(18.167f, 12.544f)
                arcToRelative(2.104f, 2.104f, 0.0f, true, true, -4.207f, 0.0f)
                arcToRelative(2.104f, 2.104f, 0.0f, false, true, 4.207f, 0.0f)
                close()
            }
        }
        .build()
        return _crunchbase!!
    }

private var _crunchbase: ImageVector? = null
