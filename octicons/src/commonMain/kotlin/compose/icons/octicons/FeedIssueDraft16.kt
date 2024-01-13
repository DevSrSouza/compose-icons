package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.FeedIssueDraft16: ImageVector
    get() {
        if (_feedIssueDraft16 != null) {
            return _feedIssueDraft16!!
        }
        _feedIssueDraft16 = Builder(name = "FeedIssueDraft16", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(3.802f, 7.334f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.482f, -0.233f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, 1.798f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, 1.482f, -0.233f)
                arcToRelative(4.296f, 4.296f, 0.0f, false, true, 0.0f, -1.332f)
                close()
                moveTo(8.0f, 2.25f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -0.899f, 0.07f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, 0.233f, 1.482f)
                arcToRelative(4.296f, 4.296f, 0.0f, false, true, 1.332f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.233f, -1.482f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 8.0f, 2.25f)
                close()
                moveTo(7.334f, 12.198f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.233f, 1.482f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 1.798f, 0.0f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -0.233f, -1.482f)
                arcToRelative(4.296f, 4.296f, 0.0f, false, true, -1.332f, 0.0f)
                close()
                moveTo(13.68f, 7.101f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.482f, 0.233f)
                arcToRelative(4.296f, 4.296f, 0.0f, false, true, 0.0f, 1.332f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.482f, 0.233f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, -1.798f)
                close()
                moveTo(5.502f, 4.561f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.882f, -1.213f)
                arcTo(5.77f, 5.77f, 0.0f, false, false, 3.348f, 4.62f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, 1.213f, 0.882f)
                curveToRelative(0.263f, -0.361f, 0.58f, -0.678f, 0.941f, -0.941f)
                close()
                moveTo(4.561f, 10.498f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.213f, 0.882f)
                arcToRelative(5.77f, 5.77f, 0.0f, false, false, 1.272f, 1.272f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, 0.882f, -1.213f)
                arcToRelative(4.285f, 4.285f, 0.0f, false, true, -0.941f, -0.941f)
                close()
                moveTo(11.38f, 3.348f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -0.882f, 1.213f)
                curveToRelative(0.36f, 0.263f, 0.679f, 0.58f, 0.941f, 0.941f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.213f, -0.882f)
                arcToRelative(5.77f, 5.77f, 0.0f, false, false, -1.272f, -1.272f)
                close()
                moveTo(12.652f, 11.38f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.213f, -0.882f)
                curveToRelative(-0.262f, 0.36f, -0.581f, 0.679f, -0.941f, 0.941f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.882f, 1.213f)
                arcToRelative(5.77f, 5.77f, 0.0f, false, false, 1.272f, -1.272f)
                close()
            }
        }
        .build()
        return _feedIssueDraft16!!
    }

private var _feedIssueDraft16: ImageVector? = null
